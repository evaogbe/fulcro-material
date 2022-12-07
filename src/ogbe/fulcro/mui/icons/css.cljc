(ns ogbe.fulcro.mui.icons.css
  #?(:cljs (:require
            ["@mui/icons-material/Css" :default Css]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-css
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Css)))