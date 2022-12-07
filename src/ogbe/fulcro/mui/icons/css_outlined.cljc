(ns ogbe.fulcro.mui.icons.css-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CssOutlined" :default CssOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-css-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CssOutlined)))