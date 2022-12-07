(ns ogbe.fulcro.mui.icons.content-paste-off
  #?(:cljs (:require
            ["@mui/icons-material/ContentPasteOff" :default ContentPasteOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-content-paste-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContentPasteOff)))