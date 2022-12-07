(ns ogbe.fulcro.mui.icons.format-paint
  #?(:cljs (:require
            ["@mui/icons-material/FormatPaint" :default FormatPaint]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-format-paint
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FormatPaint)))