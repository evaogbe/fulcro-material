(ns ogbe.fulcro.mui.icons.vertical-align-center
  #?(:cljs (:require
            ["@mui/icons-material/VerticalAlignCenter" :default VerticalAlignCenter]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-vertical-align-center
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VerticalAlignCenter)))