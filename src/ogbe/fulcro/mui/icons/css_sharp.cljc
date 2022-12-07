(ns ogbe.fulcro.mui.icons.css-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CssSharp" :default CssSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-css-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CssSharp)))