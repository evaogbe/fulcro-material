(ns ogbe.fulcro.mui.icons.alt-route
  #?(:cljs (:require
            ["@mui/icons-material/AltRoute" :default AltRoute]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-alt-route
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AltRoute)))