(ns ogbe.fulcro.mui.icons.expand-less
  #?(:cljs (:require
            ["@mui/icons-material/ExpandLess" :default ExpandLess]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-expand-less
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExpandLess)))