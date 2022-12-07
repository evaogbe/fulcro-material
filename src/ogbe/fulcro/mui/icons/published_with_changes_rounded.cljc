(ns ogbe.fulcro.mui.icons.published-with-changes-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PublishedWithChangesRounded" :default PublishedWithChangesRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-published-with-changes-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PublishedWithChangesRounded)))