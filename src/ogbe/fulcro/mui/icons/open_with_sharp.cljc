(ns ogbe.fulcro.mui.icons.open-with-sharp
  #?(:cljs (:require
            ["@mui/icons-material/OpenWithSharp" :default OpenWithSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-open-with-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OpenWithSharp)))