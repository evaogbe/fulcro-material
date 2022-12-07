(ns ogbe.fulcro.mui.icons.format-line-spacing
  #?(:cljs (:require
            ["@mui/icons-material/FormatLineSpacing" :default FormatLineSpacing]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-format-line-spacing
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FormatLineSpacing)))