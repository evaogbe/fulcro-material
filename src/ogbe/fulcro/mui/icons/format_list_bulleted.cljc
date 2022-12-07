(ns ogbe.fulcro.mui.icons.format-list-bulleted
  #?(:cljs (:require
            ["@mui/icons-material/FormatListBulleted" :default FormatListBulleted]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-format-list-bulleted
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FormatListBulleted)))