(ns ogbe.fulcro.mui.icons.wrap-text
  #?(:cljs (:require
            ["@mui/icons-material/WrapText" :default WrapText]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wrap-text
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WrapText)))