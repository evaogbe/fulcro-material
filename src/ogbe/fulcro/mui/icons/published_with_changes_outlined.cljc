(ns ogbe.fulcro.mui.icons.published-with-changes-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PublishedWithChangesOutlined" :default PublishedWithChangesOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-published-with-changes-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PublishedWithChangesOutlined)))