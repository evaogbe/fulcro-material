(ns ogbe.fulcro.mui.icons.desk
  #?(:cljs (:require
            ["@mui/icons-material/Desk" :default Desk]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-desk
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Desk)))