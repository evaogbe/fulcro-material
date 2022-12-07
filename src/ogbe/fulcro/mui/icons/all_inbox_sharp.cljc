(ns ogbe.fulcro.mui.icons.all-inbox-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AllInboxSharp" :default AllInboxSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-all-inbox-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AllInboxSharp)))