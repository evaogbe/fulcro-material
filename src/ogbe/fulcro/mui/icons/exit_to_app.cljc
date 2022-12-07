(ns ogbe.fulcro.mui.icons.exit-to-app
  #?(:cljs (:require
            ["@mui/icons-material/ExitToApp" :default ExitToApp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-exit-to-app
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExitToApp)))