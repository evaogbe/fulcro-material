(ns ogbe.fulcro.mui.icons.format-strikethrough
  #?(:cljs (:require
            ["@mui/icons-material/FormatStrikethrough" :default FormatStrikethrough]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-format-strikethrough
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FormatStrikethrough)))