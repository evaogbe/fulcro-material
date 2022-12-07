(ns ogbe.fulcro.mui.icons.all-inbox-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AllInboxRounded" :default AllInboxRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-all-inbox-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AllInboxRounded)))