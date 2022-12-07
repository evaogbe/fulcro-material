(ns ogbe.fulcro.mui.icons.expand-more
  #?(:cljs (:require
            ["@mui/icons-material/ExpandMore" :default ExpandMore]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-expand-more
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExpandMore)))