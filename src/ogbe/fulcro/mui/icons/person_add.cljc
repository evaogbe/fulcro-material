(ns ogbe.fulcro.mui.icons.person-add
  #?(:cljs (:require
            ["@mui/icons-material/PersonAdd" :default PersonAdd]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-add
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonAdd)))