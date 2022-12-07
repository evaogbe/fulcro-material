(ns ogbe.fulcro.mui.icons.call-merge
  #?(:cljs (:require
            ["@mui/icons-material/CallMerge" :default CallMerge]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call-merge
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CallMerge)))