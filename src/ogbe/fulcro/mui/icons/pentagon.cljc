(ns ogbe.fulcro.mui.icons.pentagon
  #?(:cljs (:require
            ["@mui/icons-material/Pentagon" :default Pentagon]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pentagon
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Pentagon)))