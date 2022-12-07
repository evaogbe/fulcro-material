(ns ogbe.fulcro.mui.icons.star-border
  #?(:cljs (:require
            ["@mui/icons-material/StarBorder" :default StarBorder]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-star-border
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StarBorder)))