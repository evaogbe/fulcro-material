(ns ogbe.fulcro.mui.icons.quickreply
  #?(:cljs (:require
            ["@mui/icons-material/Quickreply" :default Quickreply]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-quickreply
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Quickreply)))