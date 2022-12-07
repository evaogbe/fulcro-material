(ns ogbe.fulcro.mui.icons.format-clear
  #?(:cljs (:require
            ["@mui/icons-material/FormatClear" :default FormatClear]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-format-clear
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FormatClear)))