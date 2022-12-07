(ns ogbe.fulcro.mui.icons.six-k
  #?(:cljs (:require
            ["@mui/icons-material/SixK" :default SixK]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-six-k
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SixK)))