(ns ogbe.fulcro.mui.icons.tonality
  #?(:cljs (:require
            ["@mui/icons-material/Tonality" :default Tonality]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tonality
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Tonality)))