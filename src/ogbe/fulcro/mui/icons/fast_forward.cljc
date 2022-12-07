(ns ogbe.fulcro.mui.icons.fast-forward
  #?(:cljs (:require
            ["@mui/icons-material/FastForward" :default FastForward]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fast-forward
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FastForward)))