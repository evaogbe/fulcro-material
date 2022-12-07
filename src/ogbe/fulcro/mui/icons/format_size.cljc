(ns ogbe.fulcro.mui.icons.format-size
  #?(:cljs (:require
            ["@mui/icons-material/FormatSize" :default FormatSize]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-format-size
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FormatSize)))