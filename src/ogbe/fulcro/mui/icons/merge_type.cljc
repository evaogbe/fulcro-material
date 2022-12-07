(ns ogbe.fulcro.mui.icons.merge-type
  #?(:cljs (:require
            ["@mui/icons-material/MergeType" :default MergeType]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-merge-type
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MergeType)))