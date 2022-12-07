(ns ogbe.fulcro.mui.icons.route
  #?(:cljs (:require
            ["@mui/icons-material/Route" :default Route]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-route
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Route)))