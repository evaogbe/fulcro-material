(ns ogbe.fulcro.mui.icons.get-app
  #?(:cljs (:require
            ["@mui/icons-material/GetApp" :default GetApp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-get-app
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GetApp)))