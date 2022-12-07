(ns ogbe.fulcro.mui.icons.text-increase
  #?(:cljs (:require
            ["@mui/icons-material/TextIncrease" :default TextIncrease]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-text-increase
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TextIncrease)))