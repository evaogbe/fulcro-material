(ns ogbe.fulcro.mui.icons.more
  #?(:cljs (:require
            ["@mui/icons-material/More" :default More]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-more
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory More)))