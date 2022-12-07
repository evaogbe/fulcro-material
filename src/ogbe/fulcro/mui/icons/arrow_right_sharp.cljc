(ns ogbe.fulcro.mui.icons.arrow-right-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ArrowRightSharp" :default ArrowRightSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-right-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowRightSharp)))