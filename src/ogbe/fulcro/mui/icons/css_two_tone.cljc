(ns ogbe.fulcro.mui.icons.css-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/CssTwoTone" :default CssTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-css-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CssTwoTone)))