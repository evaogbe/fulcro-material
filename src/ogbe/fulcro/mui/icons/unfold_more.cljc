(ns ogbe.fulcro.mui.icons.unfold-more
  #?(:cljs (:require
            ["@mui/icons-material/UnfoldMore" :default UnfoldMore]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-unfold-more
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UnfoldMore)))