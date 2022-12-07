(ns ogbe.fulcro.mui.icons.css-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CssRounded" :default CssRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-css-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CssRounded)))