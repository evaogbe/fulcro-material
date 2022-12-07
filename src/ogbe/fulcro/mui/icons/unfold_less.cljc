(ns ogbe.fulcro.mui.icons.unfold-less
  #?(:cljs (:require
            ["@mui/icons-material/UnfoldLess" :default UnfoldLess]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-unfold-less
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UnfoldLess)))