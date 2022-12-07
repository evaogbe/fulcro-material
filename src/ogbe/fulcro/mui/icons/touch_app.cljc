(ns ogbe.fulcro.mui.icons.touch-app
  #?(:cljs (:require
            ["@mui/icons-material/TouchApp" :default TouchApp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-touch-app
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TouchApp)))