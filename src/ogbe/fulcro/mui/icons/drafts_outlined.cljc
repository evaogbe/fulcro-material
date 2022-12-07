(ns ogbe.fulcro.mui.icons.drafts-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DraftsOutlined" :default DraftsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-drafts-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DraftsOutlined)))