(ns ogbe.fulcro.mui.icons.format-quote
  #?(:cljs (:require
            ["@mui/icons-material/FormatQuote" :default FormatQuote]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-format-quote
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FormatQuote)))