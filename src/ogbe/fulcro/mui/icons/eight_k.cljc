(ns ogbe.fulcro.mui.icons.eight-k
  #?(:cljs (:require
            ["@mui/icons-material/EightK" :default EightK]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-eight-k
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EightK)))