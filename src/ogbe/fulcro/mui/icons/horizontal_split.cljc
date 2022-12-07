(ns ogbe.fulcro.mui.icons.horizontal-split
  #?(:cljs (:require
            ["@mui/icons-material/HorizontalSplit" :default HorizontalSplit]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-horizontal-split
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HorizontalSplit)))