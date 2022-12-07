(ns ogbe.fulcro.mui.icons.format-color-text
  #?(:cljs (:require
            ["@mui/icons-material/FormatColorText" :default FormatColorText]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-format-color-text
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FormatColorText)))