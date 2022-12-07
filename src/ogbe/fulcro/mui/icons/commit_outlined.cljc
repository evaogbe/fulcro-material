(ns ogbe.fulcro.mui.icons.commit-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CommitOutlined" :default CommitOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-commit-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CommitOutlined)))