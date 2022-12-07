(ns ogbe.fulcro.mui.icons.text-decrease
  #?(:cljs (:require
            ["@mui/icons-material/TextDecrease" :default TextDecrease]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-text-decrease
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TextDecrease)))