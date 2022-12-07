(ns ogbe.fulcro.mui.icons.short-text-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ShortTextSharp" :default ShortTextSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-short-text-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShortTextSharp)))