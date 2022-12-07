(ns ogbe.fulcro.mui.icons.format-bold
  #?(:cljs (:require
            ["@mui/icons-material/FormatBold" :default FormatBold]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-format-bold
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FormatBold)))