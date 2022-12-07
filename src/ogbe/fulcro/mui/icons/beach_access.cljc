(ns ogbe.fulcro.mui.icons.beach-access
  #?(:cljs (:require
            ["@mui/icons-material/BeachAccess" :default BeachAccess]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-beach-access
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BeachAccess)))