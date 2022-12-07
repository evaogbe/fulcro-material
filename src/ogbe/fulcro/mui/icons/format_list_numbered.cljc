(ns ogbe.fulcro.mui.icons.format-list-numbered
  #?(:cljs (:require
            ["@mui/icons-material/FormatListNumbered" :default FormatListNumbered]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-format-list-numbered
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FormatListNumbered)))