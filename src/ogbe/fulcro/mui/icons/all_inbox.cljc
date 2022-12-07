(ns ogbe.fulcro.mui.icons.all-inbox
  #?(:cljs (:require
            ["@mui/icons-material/AllInbox" :default AllInbox]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-all-inbox
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AllInbox)))