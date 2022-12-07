(ns ogbe.fulcro.mui.icons.pending
  #?(:cljs (:require
            ["@mui/icons-material/Pending" :default Pending]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pending
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Pending)))