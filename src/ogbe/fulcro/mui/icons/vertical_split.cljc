(ns ogbe.fulcro.mui.icons.vertical-split
  #?(:cljs (:require
            ["@mui/icons-material/VerticalSplit" :default VerticalSplit]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-vertical-split
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VerticalSplit)))